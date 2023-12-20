-- Create database
CREATE DATABASE inventory_system;

-- Use the created database
USE inventory_system;

-- Create table for employees
CREATE TABLE employees (
    employee_id INT AUTO_INCREMENT PRIMARY KEY,
    employee_name VARCHAR(50) NOT NULL,
    employee_email VARCHAR(100) UNIQUE,
    employee_role VARCHAR(50)
);

-- Create table for customers
CREATE TABLE customers (
    customer_id INT AUTO_INCREMENT PRIMARY KEY,
    customer_name VARCHAR(50) NOT NULL,
    customer_email VARCHAR(100) UNIQUE,
    customer_phone VARCHAR(20)
);

-- Create table for suppliers
CREATE TABLE suppliers (
    supplier_id INT AUTO_INCREMENT PRIMARY KEY,
    supplier_name VARCHAR(50) NOT NULL,
    supplier_email VARCHAR(100) UNIQUE,
    supplier_phone VARCHAR(20)
);

-- Example of how you might relate other tables to the items in the inventory
CREATE TABLE inventory (
    item_id INT AUTO_INCREMENT PRIMARY KEY,
    item_name VARCHAR(100) NOT NULL,
    item_price DECIMAL(10, 2),
    item_quantity INT,
    supplier_id INT,
    FOREIGN KEY (supplier_id) REFERENCES suppliers(supplier_id)
);

-- Example of relating employees to the inventory (assuming an employee manages items)
CREATE TABLE employee_inventory (
    employee_id INT,
    item_id INT,
    FOREIGN KEY (employee_id) REFERENCES employees(employee_id),
    FOREIGN KEY (item_id) REFERENCES inventory(item_id),
    PRIMARY KEY (employee_id, item_id)
);
