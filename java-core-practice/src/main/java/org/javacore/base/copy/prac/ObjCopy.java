package org.javacore.base.copy.prac;

/**
*  Copyright [2016/12/26] [Wuxinshui]
*
*  Licensed under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License.
*  You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software
*  distributed under the License is distributed on an "AS IS" BASIS,
*  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*  See the License for the specific language governing permissions and
*  limitations under the License.
*/



/**
 * Created by FujiRen on 2016/12/22.
 * 浅拷贝是按位拷贝对象，它会创建一个新对象，这个对象有着原始对象属性值的一份精确拷贝。如果属性是基本类型，拷贝的就是基本类型的值；如果属性是内存地址（引用类型），拷贝的就是内存地址 ，因此如果其中一个对象改变了这个地址，就会影响到另一个对象。
 * 深拷贝会拷贝所有的属性,并拷贝属性指向的动态分配的内存。当对象和它所引用的对象一起拷贝时即发生深拷贝。深拷贝相比于浅拷贝速度较慢并且花销较大。
 */
public class ObjCopy {

    public static void main(String[] args) {
        copyTest();
    }

    public static void copyTest(){
        Student student=new Student(12,"Lisa");
        Classroom classroom=new Classroom(1,"L1",student);
        Classroom classroom1=(Classroom) classroom.clone();
        System.out.print("对象classroom："+classroom.getStu().getName()+" 在班级 "+classroom.getRoomName()+" 班级号码是："+classroom.getRoomNum());
        System.out.println("  对象classroom1："+classroom1.getStu().getName()+" 在班级 "+classroom1.getRoomName()+" 班级号码是："+classroom1.getRoomNum());
        //clone对象改变基本类型：教室名字
        classroom1.setRoomName("L2");
        classroom1.setRoomNum(2);
        //深复制、浅复制，源对象基本数据类型的值不改变
        System.out.print("对象classroom："+classroom.getStu().getName()+" 在班级 "+classroom.getRoomName()+" 班级号码是："+classroom.getRoomNum());
        System.out.println("  对象classroom1："+classroom1.getStu().getName()+" 在班级 "+classroom1.getRoomName()+" 班级号码是："+classroom1.getRoomNum());
        //改变引用类型：学生名字
        classroom1.getStu().setName("Lily");
        //浅复制，clone对象的引用属性改变导致源对象引用属性改变
        //深复制，源对象的引用属性不变。clone对象是独立的对象
        System.out.print("对象classroom："+classroom.getStu().getName()+" 在班级 "+classroom.getRoomName()+" 班级号码是："+classroom.getRoomNum());
        System.out.println("  对象classroom1："+classroom1.getStu().getName()+" 在班级 "+classroom1.getRoomName()+" 班级号码是："+classroom1.getRoomNum());
    }

}
