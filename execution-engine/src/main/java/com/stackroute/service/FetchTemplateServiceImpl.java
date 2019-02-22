package com.stackroute.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Service
public class FetchTemplateServiceImpl implements FetchService {
    public String giturl;
    @Override
    public String setGitURL(String giturl){
        this.giturl=giturl;
        return giturl;
    }
    @Override
    public String getGitUrl(){
        return this.giturl;

    }


    public void fetchFilesAndSave() throws IOException, InterruptedException {

         String gitUrl= getGitUrl();
        System.out.println("git"+gitUrl);
        String[] cmdScript = new String[]{"sh", "/home/user/Documents/boeing-wave3-mashup/execution-engine/src/main/java/com/stackroute/script/fetch.sh", gitUrl};
        Process procScript = Runtime.getRuntime().exec(cmdScript);
        procScript.waitFor();
        BufferedReader reader = new BufferedReader(new InputStreamReader(procScript.getInputStream()));
        BufferedReader errorReader = new BufferedReader(new InputStreamReader(procScript.getErrorStream()));


        String line = "";
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        line = "";
        while ((line = errorReader.readLine()) != null) {
            System.out.println(line);
        }

}}
