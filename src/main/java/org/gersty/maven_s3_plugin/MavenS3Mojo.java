package org.gersty.maven_s3_plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.cas.iap.text.annotations.TextRetrievable;
import org.cas.osd.iap.express.processor.MemberAnnotationProcessor;

import org.cas.osd.iap.express.processor.MemberAnnotationProcessor$;
import org.cas.osd.iap.express.processor.Reflector;
import org.cas.spot.load.express.model.entity.DocumentContent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import scala.collection.Seq;
import scala.reflect.ClassTag;
//import scala.reflect.runtime.V
import java.lang.annotation.Target;
import java.lang.reflect.Member;
import java.util.List;

import scala.reflect.ClassTag$;
import scala.reflect.api.TypeTags;


@Mojo(name = "upload")
public class MavenS3Mojo extends AbstractMojo {
    Logger logger = LoggerFactory.getLogger(MavenS3Mojo.class);
    @Parameter(property = "location")
    private String location;

    @SuppressWarnings("unchecked")
    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.println(test());

    }

    public List<String> test(){

        TypeTags.TypeTag<?> typeTag = Reflector.classNameToTypeTag(DocumentContent.class.getName());
        ClassTag<?> classTag = ClassTag$.MODULE$.apply(TextRetrievable.class);
        MemberAnnotationProcessor stuff = new MemberAnnotationProcessor(typeTag, classTag);
        return scala.collection.JavaConversions.seqAsJavaList(stuff.findAnnotatedMembersFromTypeTag(typeTag));

    }
}
