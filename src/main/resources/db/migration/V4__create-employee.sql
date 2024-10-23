CREATE TABLE employee (
    id INT AUTO_INCREMENT,
    first_name VARCHAR(45),
    last_name VARCHAR(45),
    pis VARCHAR(45),
    cpf VARCHAR(45),
    rg VARCHAR(45),
    rg_issue_date DATE,
    rg_issuer VARCHAR(45),
    rg_state VARCHAR(45),
    driver_license VARCHAR(45),
    driver_license_category VARCHAR(45),
    driver_license_issue_date DATE,
    driver_license_expiry_date DATE,
    work_card VARCHAR(45),
    work_card_series VARCHAR(45),
    work_card_state VARCHAR(45),
    voter_registration VARCHAR(45),
    birth_date DATE,
    nationality VARCHAR(45),
    zip_code VARCHAR(45),
    state VARCHAR(45),
    neighborhood VARCHAR(45),
    city VARCHAR(45),
    address VARCHAR(45),
    gender VARCHAR(45),
    marital_status VARCHAR(45),
    mother_name VARCHAR(45),
    father_name VARCHAR(45),
    badge VARCHAR(45),
    phone VARCHAR(45),
    hire_date DATE,
    termination_date DATE,
    status VARCHAR(45),
    termination_reason VARCHAR(45),
    department VARCHAR(45),
    position VARCHAR(45),
    position_description VARCHAR(45),
    admission_exam DATE,
    probation_period VARCHAR(45),
    first_job VARCHAR(45),
    social_contribution VARCHAR(45),
    admission_id INT,
    relationship VARCHAR(45),
    salary DECIMAL(10,2),
    bank VARCHAR(45),
    agency VARCHAR(45),
    account VARCHAR(45),
    google_email VARCHAR(45),
    hotmail_email VARCHAR(45),
    exam_location VARCHAR(45),
    image_url VARCHAR(45),
    enterprise_id INT,
    period_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (enterprise_id) REFERENCES enterprise(id),
    FOREIGN KEY (period_id) REFERENCES period(id)
);