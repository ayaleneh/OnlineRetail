INSERT INTO Supplier (id, name, phone_number)
VALUES
    (1, 'Iowa Farms', '(641) 451-0009'),
    (2, 'Hallmark Agro, Inc.', NULL);

INSERT INTO Product (id, name, unit_price, quantity, date_supplied, supplier_id)
VALUES
    (1, 'Santa sweet apples', 1.09, 124, '2023-05-31', 1),
    (2, 'Chicken drumsticks', 2.25, 18, '2023-04-10', 1),
    (3, 'Dole Bananas', 0.55, 1097, '2023-05-15', 2);
