# Project Statement

## Problem Statement
Managing bank accounts manually or on paper is slow and error-prone. It’s easy to make calculation mistakes or lose track of transactions. We need a digitized way to handle these operations that ensures the math is always right, keeps the data secure behind a password, and automatically records a history of what happened so the user doesn't have to remember it.

## Scope of the project
This project covers the backend logic of a banking system running in a console environment.
* **What it does:** Handles user accounts, validates passwords, performs math for deposits/withdrawals, and stores a temporary history list.
* **What it doesn't do:** It doesn't use a real database (like SQL), so data resets when the program closes. It also doesn't have a graphical interface (GUI).

## Target users
* **Students:** To understand how banking logic works in code.
* **Bank Customers:** People who want to simulate managing a savings account.
* **Admins:** For checking how transaction flows work.

## High-level features
* **Account Security:** Users must have a password to see their balance.
* **Balance Checks:** You can't withdraw money you don't have.
* **Data Entry Checks:** Prevents entering invalid amounts (like negative numbers).
* **Transaction Logs:** Keeps a running list of everything the user does in a session.
