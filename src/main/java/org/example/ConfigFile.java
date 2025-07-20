package org.example;

public class ConfigFile {

    /*    --- CONFIG FILE ---

        [ req ]
        default_bits       = 2048
        distinguished_name = req_distinguished_name
        req_extensions     = req_extensions_section

        [ req_distinguished_name ]
        countryName                     = Country Name (2 letter code)
        countryName_min                 = 2
        countryName_max                 = 2
        countryName_default             = RU
        stateOrProvinceName             = State or Province Name (full name)
        stateOrProvinceName_default     = CRQ279775
        localityName                    = Locality Name (eg, city)
        localityName_default            = Moscow
        organizationName                = Organization Name (eg, company)
        organizationName_default        = PJSC VimpelCom
        organizationalUnitName          = Organizational Unit Name (eg, section)
        organizationalUnitName_default  = FinBlock
        commonName                      = Common Name (eg, server FQDN or YOUR name)
        commonName_max                  = 64
        commonName_default              = basis-portal.srms-test-linux.cloud.vimpelcom.ru
        emailAddress                    = Email Address (eg, admin@example.com)
        emailAddress_max                = 64
        emailAddress_default            = MiVyaMoiseev@beeline.ru
        certificateTemplate		= Web_Server

        [ req_extensions_section ]
        subjectAltName = @subject_alternative_name_section

        [ subject_alternative_name_section ]
        DNS.1   = basis-portal.srms-test-linux.cloud.vimpelcom.ru
        DNS.2   = basis-portal


         */


    public static void configFileGeneration(String CRQ, String server, String serverCut){


        String configBody = "[ req ]\n" +
                "        default_bits       = 2048\n" +
                "        distinguished_name = req_distinguished_name\n" +
                "        req_extensions     = req_extensions_section\n" +
                "\n" +
                "        [ req_distinguished_name ]\n" +
                "        countryName                     = Country Name (2 letter code)\n" +
                "        countryName_min                 = 2\n" +
                "        countryName_max                 = 2\n" +
                "        countryName_default             = RU\n" +
                "        stateOrProvinceName             = State or Province Name (full name)\n" +
                "        stateOrProvinceName_default     = "+CRQ+"\n" +
                "        localityName                    = Locality Name (eg, city)\n" +
                "        localityName_default            = Moscow\n" +
                "        organizationName                = Organization Name (eg, company)\n" +
                "        organizationName_default        = PJSC VimpelCom\n" +
                "        organizationalUnitName          = Organizational Unit Name (eg, section)\n" +
                "        organizationalUnitName_default  = FinBlock\n" +
                "        commonName                      = Common Name (eg, server FQDN or YOUR name)\n" +
                "        commonName_max                  = 64\n" +
                "        commonName_default              = basis-portal.srms-test-linux.cloud.vimpelcom.ru\n" +
                "        emailAddress                    = Email Address (eg, admin@example.com)\n" +
                "        emailAddress_max                = 64\n" +
                "        emailAddress_default            = MiVyaMoiseev@beeline.ru\n" +
                "        certificateTemplate\t\t= Web_Server\n" +
                "\n" +
                "        [ req_extensions_section ]\n" +
                "        subjectAltName = @subject_alternative_name_section\n" +
                "\n" +
                "        [ subject_alternative_name_section ]\n" +
                "        DNS.1   = "+server+"\n" +
                "        DNS.2   = "+serverCut+"\n";





    }


}
