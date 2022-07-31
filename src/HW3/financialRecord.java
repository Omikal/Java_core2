package HW3;

public class financialRecord {
    private int incomes;
    private int outcomes;
    public financialRecord(int finIn, int finOut) {
        this.incomes = finIn;
        this.outcomes = finOut;
    }
    public int getOutcomes() {
        return outcomes;
    }
    public void setOutcomes(int outcomes) {
        this.outcomes = outcomes;
    }
    public int getIncomes() {
        return incomes;
    }
    public void setIncomes(int incomes) {
        this.incomes = incomes;
    }
    public String result() {
        return this.incomes + ";" + this.outcomes + "\n";
    }
}
