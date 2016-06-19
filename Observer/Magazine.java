package by.Prohorov.Observer;

public class Magazine {
    //Номер выпуска
    private int issue = 0;
    //Колличество изданных выпусков
    private static int counter = 0;

    public Magazine() {
        this.issue = ++counter;
    }

    @Override
    public String toString() {
        return "Issue" + issue;
    }
}
