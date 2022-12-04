package mainPackage.process;

import mainPackage.notes.Note;
import mainPackage.notes.NotesCollection;

import java.io.*;
import java.util.ArrayList;

public class LoadNote implements Serializable {

    @SuppressWarnings("unchecked")
    public static void loadNote() {
        try (FileInputStream fileInput = new FileInputStream("D:\\2.txt");
             ObjectInputStream objectInput = new ObjectInputStream(fileInput)) {
            Object object = objectInput.readObject();
            NotesCollection.arrayListNote = (ArrayList<Note>) object;
        } catch (IOException | ClassNotFoundException e) {
        }
    }

}
