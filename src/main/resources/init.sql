CREATE TABLE IF NOT EXISTS truck (
                                     id SERIAL PRIMARY KEY,
                                     make VARCHAR(255),
    model VARCHAR(255)
    );

-- Create 'delivery' table
CREATE TABLE IF NOT EXISTS delivery (
                                        id SERIAL PRIMARY KEY,
                                        destination VARCHAR(255),
    completed BOOLEAN NOT NULL,
    amount_received DECIMAL(10, 2) -- New column for amount received
    );
