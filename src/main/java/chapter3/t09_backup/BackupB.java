package chapter3.t09_backup;

public class BackupB extends Thread {

    private DBTools dbtools;

    public BackupB(DBTools dbtools) {
        super();
        this.dbtools = dbtools;
    }

    @Override
    public void run() {
        dbtools.backupB();
    }

}
