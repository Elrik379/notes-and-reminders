package mainPackage;

import mainPackage.process.LoadNote;
import mainPackage.process.MainProcess;
import mainPackage.views.ThisDate;


public class Main {


    public static void main(String[] args) {
        ThisDate.getDate();
        LoadNote.loadNote();
        MainProcess.getProcess();

    }
}
