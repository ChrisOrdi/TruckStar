CREATE TABLE IF NOT EXISTS truck (
                                     id SERIAL PRIMARY KEY,
                                     make VARCHAR(255),
    model VARCHAR(255)
    );

CREATE TABLE IF NOT EXISTS delivery (
                                        id SERIAL PRIMARY KEY,
                                        destination VARCHAR(255),
    completed BOOLEAN
    );
