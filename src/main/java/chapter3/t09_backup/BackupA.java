package chapter3.t09_backup;

public class BackupA extends Thread {

    private DBTools dbtools;

    public BackupA(DBTools dbtools) {
        super();
        this.dbtools = dbtools;
    }

    @Override
    public void run() {
        dbtools.backupA();
    }

}
