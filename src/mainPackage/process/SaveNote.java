package mainPackage.process;

import mainPackage.notes.NotesCollection;

import java.io.*;

public class SaveNote implements Serializable {

    public static void saveNoteInFile() {
        try (FileOutputStream fileOutput = new FileOutputStream("D:\\2.txt");
             ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput)) {
            objectOutput.writeObject(NotesCollection.arrayListNote);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
