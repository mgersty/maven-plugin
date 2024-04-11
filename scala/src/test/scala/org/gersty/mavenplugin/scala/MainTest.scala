package org.gersty.mavenplugin.scala
import com.google.common.reflect.ClassPath
import com.google.common.reflect.ClassPath.ClassInfo
import org.cas.iap.text.annotations.TextRetrievable
import org.cas.osd.iap.express.processor._
import org.scalatest.funspec.AnyFunSpec

import scala.collection.JavaConverters.asScalaIteratorConverter
import scala.reflect.runtime.currentMirror
class MainTest extends AnyFunSpec{
  it("can test"){


      val stuff = asScalaIteratorConverter(ClassPath.from(currentMirror.classLoader).getAllClasses.stream().iterator())
        .asScala
        .filter { clazz: ClassInfo => clazz.getPackageName.equalsIgnoreCase("org.cas.spot.load.express.model.entity") }
        .toList


      val documentContent = currentMirror.staticClass("org.cas.spot.load.express.model.entity.DocumentContent")
      val test = Reflector.classNameToTypeTag(documentContent.fullName)
      val annotatedMembers = new MemberAnnotationProcessor[TextRetrievable].findAnnotatedMembersFromTypeTag(test)

      val listOfMembers = annotatedMembers.map(x => {
        x.memberName
      }).toList
      assert(listOfMembers.size == 4)
  }
}

