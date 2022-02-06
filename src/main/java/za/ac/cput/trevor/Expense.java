package za.ac.cput.trevor;

public class Expense
{
    double grocery;
    double utilities;
    double transport;
    double saving;
    double entertainment;
    double additionalExpenseRands;
    String additionalExpense;

    public Expense(double grocery, double utilities, double transport, double saving, double entertainment, double additionalExpenseRands, String additionalExpense) {
        this.grocery = grocery;
        this.utilities = utilities;
        this.transport = transport;
        this.saving = saving;
        this.entertainment = entertainment;
        this.additionalExpense = additionalExpense;
        this.additionalExpenseRands = additionalExpenseRands;
    }

    public double getGrocery() {
        return grocery;
    }

    public void setGrocery(double grocery) {
        this.grocery = grocery;
    }

    public double getUtilities() {
        return utilities;
    }

    public String getAdditionalExpense() {
        return additionalExpense;
    }

    public void setAdditionalExpense(String additionalExpense) {
        this.additionalExpense = additionalExpense;
    }

    public void setUtilities(double utilities) {
        this.utilities = utilities;
    }

    public double getTransport() {
        return transport;
    }

    public void setTransport(double transport) {
        this.transport = transport;
    }

    public double getSaving() {
        return saving;
    }

    public void setSaving(double saving) {
        this.saving = saving;
    }

    public double getEntertainment() {
        return entertainment;
    }

    public void setEntertainment(double entertainment) {
        this.entertainment = entertainment;
    }

    public double getAdditionalExpenseRands() {
        return additionalExpenseRands;
    }

    public void setAdditionalExpenseRands(double additionalExpenseRands) {
        this.additionalExpenseRands = additionalExpenseRands;
    }

    @Override
    public String toString() {
        return "Expenses" +
                "\n grocery = " + grocery +
                "\n utilities = " + utilities +
                "\n transport = " + transport +
                "\n saving = " + saving +
                "\n entertainment = " + entertainment +
                "\n " + additionalExpense +" = "+ additionalExpenseRands;

    }
}
