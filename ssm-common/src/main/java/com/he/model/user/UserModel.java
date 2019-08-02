package com.he.model.user;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Setter
@Getter
@Data
@TableName("zr_user")
public class UserModel extends Model<UserModel> {

//    private static final long serialVersionUID = 1L;

    public static Class aClass;

    public static void main(String[] args) {
        UserModel userModel = new UserModel();
        userModel.getClassName();
//        System.out.println();
        Constructor[] constructors = userModel.aClass.getConstructors();

        for (Constructor c: constructors) {
            System.out.println("c: " + c);
        }


        Field[] fields = userModel.aClass.getFields();
        for (Field field: fields) {
            System.out.println("field: " + field);
        }


        if (UserModel.aClass != null) {
//            Class bClass = new UserModel.aClass();
            System.out.println(UserModel.aClass);
        } else {
            System.out.println("No No No!");
        }

        try {
            Method show = userModel.aClass.getMethod("show");
            Method show2 = userModel.aClass.getMethod("show2", Integer.class);
            Method show1 = userModel.aClass.getMethod("show1", String.class);
            Method return1 = userModel.aClass.getMethod("return1", String.class);
            System.out.println("method show: " + show);
            try {
                Object userModelObject = userModel.aClass.getConstructor().newInstance();
                show.invoke(userModelObject);
                show2.invoke(userModelObject, 1857638099);
                show1.invoke(userModelObject, "show1 args");
                Object return2 = return1.invoke(userModelObject, "return1 args");
                System.out.println("return value is: " + return2);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }

    private final static long serialVersionUID = 1L;

    /**
     * 用户id
     */
    @TableId
    private Integer user_id;

    @NotNull(message = "用户名不能为空")
    @Size(min = 6, max = 20, message = "用户名应在6-20个字符之间")
    private String user_username;


    @Override
    protected Serializable pkVal() {
        return this.user_id;
    }

    public void getClassName() {
        try {
            this.aClass = Class.forName("com.he.model.user.UserModel");
        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
        }
    }

    public void show() {
        System.out.println("this is show method");
    }

    public void show1(String str) {
        System.out.println("method show1: " + str);
    }

    public void show2(Integer i) {
        System.out.println("method show2: " + i);
    }

    public String return1(String str) {
        return "this is method return1 data, " + str;
    }
}
