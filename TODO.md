# TODO: Fix Database Type Mismatches in Restaurant Management System

## Issues Identified

-   **Product.java**: Price is inserted as String but DB expects DECIMAL (numeric).
-   **Signup.java**: Phone is inserted as String but DB expects DECIMAL.
-   **AdminPage.java**: Price retrieval is fine (getDouble).
-   **Order.java**: Price retrieval returns String, but used as double; may need casting.
-   "No data found for last sale" is a handled message, not an error.
-   Image validation is already handled.

## Tasks

1. Fix Product.java: Convert price to double before database insertion in addActionPerformed and updateActionPerformed.
2. Fix Signup.java: Convert phone to BigDecimal before database insertion in signUpActionPerformed.
3. Test the fixes by running the application (if possible).
4. Verify database operations work without type errors.

## Status

-   [ ] Task 1: Fix Product.java price conversion
-   [ ] Task 2: Fix Signup.java phone conversion
-   [ ] Task 3: Test fixes
-   [ ] Task 4: Verify database operations
