package co.edu.uptc.persistens;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import co.edu.uptc.models.TypeDocument;

public class FileBinaryUsers {

	public static String PATH_FILE = "Files/file.txt";
	private ArrayList<String> listLines;

	public FileBinaryUsers() {
		listLines = new ArrayList<>();
	}

	public void writeBinary(int id, String name, String lastName, TypeDocument typeDocument, String numberDocument, String user, String password)
			throws IOException {
		FileOutputStream fileOutputStream = null;
		DataOutputStream dataOutputStream = null;
		fileOutputStream = new FileOutputStream(PATH_FILE, true);
		dataOutputStream = new DataOutputStream(fileOutputStream);
		dataOutputStream.writeInt(id);
		dataOutputStream.writeUTF(name);
		dataOutputStream.writeUTF(lastName);
		dataOutputStream.writeUTF(typeDocument.toString());
		dataOutputStream.writeUTF(numberDocument);
		dataOutputStream.writeUTF(user);
		dataOutputStream.writeUTF(password);

		dataOutputStream.close();
	}

	@SuppressWarnings("resource")
	public void readBinary() throws Exception {
		FileInputStream fileIS = null;
		DataInputStream dataIS = null;
		fileIS = new FileInputStream(PATH_FILE);
		dataIS = new DataInputStream(fileIS);
		while (dataIS.available() > 0) {
//			System.out.println("id: " + dataIS.readInt());
//			System.out.println("name: " + dataIS.readUTF());
//			System.out.println("lastName: " + dataIS.readUTF());
//			System.out.println("TypeDocument: " + dataIS.readUTF());
//			System.out.println("numberDocument: " + dataIS.readUTF());
//			System.out.println("user: " + dataIS.readUTF());
//			System.out.println("password: " + dataIS.readUTF());
		}
	}

	@SuppressWarnings("resource")
	public List<String> readBinaryList() throws Exception {
		String line = "";
		FileInputStream fileIS = null;
		DataInputStream dataIS = null;
		fileIS = new FileInputStream(PATH_FILE);
		dataIS = new DataInputStream(fileIS);
		while (dataIS.available() > 0) {
			line += dataIS.readInt() + "?" + dataIS.readUTF() + "?" + dataIS.readUTF() + "?" +  dataIS.readUTF() + "?"
					+  dataIS.readUTF() + "?" + dataIS.readUTF() + "?" + dataIS.readUTF() + "?";
			listLines.add(line);
			line = "";
		}
		return listLines;
	}

	public void deleteBinary() throws Exception {

	}
}