/*package com.dao;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;

public class Test1 {
	 public static String blobToString(BLOB blob) throws Exception {
	
	        byte[] data = new byte[(int) blob.length()];
	        BufferedInputStream instream = null;
	        try {
	        instream = new BufferedInputStream(blob.getBinaryStream());
	        instream.read(data);
	        } catch (Exception ex) {
	        throw new Exception(ex.getMessage());
	        } finally {
	        instream.close();
	        }
	        
	        int chunk = 65536;
	        ByteArrayInputStream bis = new ByteArrayInputStream(data);
	        GZIPInputStream gis = new GZIPInputStream(bis);
	
	         int length = 0;
	        byte[] buffer = new byte[chunk];
	        ByteArrayOutputStream bos = new ByteArrayOutputStream();
	        while ((length = gis.read(buffer, 0, chunk)) != -1) {
	        bos.write(buffer, 0, length);
	        }
	
	        gis.close();
	        bis.close();
	        bos.close();
	        
	        String str = bos.toString();
	        System.out.println(str);
	        return str;
	
	    }
}

*/