package mainPackage.process;

import mainPackage.notes.Note;
import mainPackage.notes.NotesCollection;

import java.io.PrintStream;
import java.util.Scanner;

public class MainProcess {


    public static void getProcess() {
        PrintStream printStream = new PrintStream(System.out);
        Scanner scanner = new Scanner(System.in);
        boolean cycle = true;
        while (cycle) {
            printStream.println("Для выбора одного из вариантов введите его число");
            printStream.println("1 - Написать заметку \n2 - Показать все заметки " +
                    "\n3 - Удалить заметку \n4 - Завершить работу");

            int temp = scanner.nextInt();
            switch (temp) {
                case 1 -> noteWrite();
                case 2 -> showAllNote();
                case 3 -> removeNote();
                case 4 -> {
                    SaveNote.saveNoteInFile();
                    cycle = false;
                }
            }
        }
    }

    public static void noteWrite() {
        PrintStream printStream = new PrintStream(System.out);
        Scanner scanner = new Scanner(System.in);
        printStream.println("Введите имя заметки, не больше 40 символов");
        String name = scanner.nextLine();
        printStream.println("Введите заметку");
        String noteWrite = scanner.nextLine();
        Note newNote = new Note(name, noteWrite);
        NotesCollection.arrayListNote.add(newNote);
    }

    public static void showAllNote(){
        PrintStream printStream = new PrintStream(System.out);
        for(Note note : NotesCollection.arrayListNote){
            printStream.println(note.getNoteName() + "\n" + note.getNoteContent() + "\n");
        }
    }

    public static void removeNote() {
        PrintStream printStream = new PrintStream(System.out);
        Scanner scanner = new Scanner(System.in);
        printStream.println("Введите название заметки для удаления");
        String noteRemove = scanner.nextLine();
        NotesCollection.arrayListNote.removeIf(note -> note.getNoteName().equals(noteRemove));
    }
}
