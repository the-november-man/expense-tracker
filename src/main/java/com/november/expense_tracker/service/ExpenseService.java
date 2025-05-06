package com.november.expense_tracker.service;

import com.november.expense_tracker.model.Expense;
import com.november.expense_tracker.repo.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepo;

    public void saveExpense(Expense expense) {
        expenseRepo.save(expense);
    }

    public List<Expense> getAllExpenses() {
        return  expenseRepo.findAll();
    }

    public Expense getExpenseById(Long id) {
        return expenseRepo.findById(id).orElse(null);
    }

    public void deleteExpenseById(Long id) {
        expenseRepo.deleteById(id);
    }

}
