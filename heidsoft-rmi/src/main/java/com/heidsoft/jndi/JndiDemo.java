package com.heidsoft.jndi;

import javax.naming.NamingException;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

class JdniDemo {
    public static void main(String args[]) throws NamingException {
        DirContext ctx = new InitialDirContext();
        Attributes attrs = ctx.getAttributes("cn = john, ou= people");
        System.out.println("name is " + attrs.get("nm").get());
    }
}