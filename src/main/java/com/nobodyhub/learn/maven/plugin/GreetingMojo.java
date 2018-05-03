package com.nobodyhub.learn.maven.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * Simple example follows: https://maven.apache.org/guides/plugin/guide-java-plugin-development.html
 *
 * @author Ryan
 */
@Mojo(name = "sayhi")
public class GreetingMojo extends AbstractMojo {

    @Parameter(defaultValue = "World")
    private String name;

    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("Hello," + name);
    }
}
