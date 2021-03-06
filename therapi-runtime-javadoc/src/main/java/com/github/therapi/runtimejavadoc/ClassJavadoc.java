package com.github.therapi.runtimejavadoc;

import static com.github.therapi.runtimejavadoc.internal.RuntimeJavadocHelper.unmodifiableDefensiveCopy;

import java.util.List;

public class ClassJavadoc {
    private final String name;
    private final Comment comment;
    private final List<SeeAlsoJavadoc> seeAlso;
    private final List<OtherJavadoc> other;
    private final List<MethodJavadoc> methods;

    public ClassJavadoc(String name,
                        Comment comment,
                        List<OtherJavadoc> other,
                        List<SeeAlsoJavadoc> seeAlso,
                        List<MethodJavadoc> methods) {
        this.name = name;
        this.comment = comment;
        this.other = unmodifiableDefensiveCopy(other);
        this.seeAlso = unmodifiableDefensiveCopy(seeAlso);
        this.methods = unmodifiableDefensiveCopy(methods);
    }

    public String getName() {
        return name;
    }

    public Comment getComment() {
        return comment;
    }

    public List<SeeAlsoJavadoc> getSeeAlso() {
        return seeAlso;
    }

    public List<OtherJavadoc> getOther() {
        return other;
    }

    public List<MethodJavadoc> getMethods() {
        return methods;
    }

    @Override
    public String toString() {
        return "ClassJavadoc{" +
                "name='" + name + '\'' +
                ", comment=" + comment +
                ", seeAlso=" + seeAlso +
                ", other=" + other +
                ", methods=" + methods +
                '}';
    }
}
