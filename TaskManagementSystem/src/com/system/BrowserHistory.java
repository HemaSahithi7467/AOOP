package com.system;
import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    private Deque<String> history;
    private Deque<String> forwardHistory;

    public BrowserHistory() {
        history = new ArrayDeque<>();
        forwardHistory = new ArrayDeque<>();
    }

    // Add a new page to history
    public void visitPage(String page) {
        history.push(page);
        forwardHistory.clear(); // Clear forward history on new page visit
    }

    // Go back to the previous page
    public void goBack() {
        if (!history.isEmpty()) {
            String currentPage = history.pop();
            forwardHistory.push(currentPage);
            System.out.println("Went back to: " + (history.isEmpty() ? "Home" : history.peek()));
        } else {
            System.out.println("No previous pages.");
        }
    }

    // Go forward to the next page
    public void goForward() {
        if (!forwardHistory.isEmpty()) {
            String nextPage = forwardHistory.pop();
            history.push(nextPage);
            System.out.println("Went forward to: " + nextPage);
        } else {
            System.out.println("No forward pages.");
        }
    }

    // Display the current page
    public void displayCurrentPage() {
        if (!history.isEmpty()) {
            System.out.println("Current page: " + history.peek());
        } else {
            System.out.println("No current page.");
        }
    }

    public static void main(String[] args) {
        BrowserHistory bh = new BrowserHistory();
        bh.visitPage("google.com");
        bh.visitPage("stackoverflow.com");
        bh.displayCurrentPage();
        bh.goBack();
        bh.goForward();
    }
}

