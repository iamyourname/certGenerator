package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class InitClass {


    public static String[][] hostEnv = new String[29][4];
    public static void readHosts(){
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("/Users/m.moiseev/IdeaProjects/certGenerator/host:env"));
            String line = reader.readLine();
            int i = 0;
            while (line != null) {
                String[] parts = line.split(":");
                hostEnv[i][0] = parts[0]; // host name
                hostEnv[i][1] = parts[1]; // env
                hostEnv[i][2] = parts[2]; // env ID
                hostEnv[i][3] = parts[3]; // host env id
                i++;
                // read next line
                line = reader.readLine();
            }
            System.out.println(i);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String getHostsByEnv(String env){

        String response = "hosts";

        for (int i = 0; i < hostEnv.length; i++) {
            if(hostEnv[i][1].equals(env)){
                response += ","+hostEnv[i][0];
            }

        }

        return response;
    }

    public static String selectHostByEnv(String envID, String hostID){

        for(int i = 0; i < hostEnv.length; i++){
            if(hostEnv[i][2].equals(envID) && hostEnv[i][3].equals(hostID)){
                return hostEnv[i][0];
            }
        }

        return null;
    }

    public static void userInput(String host, String crq){

        System.out.println("Выбранный хост: "+host);
        System.out.println("Номер CRQ: CRQ"+crq);

    }




}
