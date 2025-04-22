package javaexp;
class BankAccount {
private int balance = 0;
public synchronized void deposit(int amount) {
   int newBalance = balance + amount;
   try { Thread.sleep(100); } catch (InterruptedException e) {}
   balance = newBalance;
}
public int getBalance() {
   return balance;
}
}