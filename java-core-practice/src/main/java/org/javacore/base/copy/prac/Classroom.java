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
 *
 */
public class Classroom implements Cloneable{
    private int roomNum;
    private String roomName;
    private Student stu;

    public Classroom(int roomNum, String roomName, Student stu) {
        this.roomNum = roomNum;
        this.roomName = roomName;
        this.stu = stu;
    }

    /**
     * 浅复制
     */
    @Override
    protected Object clone()  {
        Object o=null;
        try {
            o=super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return o;
    }

    /**
     * 深复制
     * @return
     */
/*    @Override
    protected Object clone()  {
        Classroom classroom=null;
        try {
            classroom=(Classroom)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //关键代码 copy对象的引用
        classroom.stu=(Student)stu.clone();
        return classroom;
    }*/

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }
}
