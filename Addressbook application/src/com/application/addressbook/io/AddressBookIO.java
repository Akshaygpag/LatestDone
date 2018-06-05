package com.application.addressbook.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Akshay
 * @version 1.0.0
 * @since 05-Jun-2018
 */

public class AddressBookIO {
    static ObjectOutputStream writer = null;
    static ObjectInputStream reader = null;

    public static ObjectOutputStream setFileParametersWriter(File file) throws FileNotFoundException, IOException {
	writer = new ObjectOutputStream(new FileOutputStream(file));
	return writer;
    }

    public static ObjectInputStream setFileParameterReader(File file) {
	try {

	    reader = new ObjectInputStream(new FileInputStream(file));
	    return reader;

	} catch (Exception e) {

	    e.printStackTrace();
	    return null;
	}
    }

}
