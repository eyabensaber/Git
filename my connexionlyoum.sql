SET SERVEROUTPUT ON;
--for
DECLARE
    v_emp_id employees.employee_id%TYPE;
    v_emp_name employees.first_name%TYPE;
    v_emp_last_name employees.last_name%TYPE;
BEGIN
    
    FOR i IN 100..120 LOOP
        
        IF MOD(i, 2) = 0 THEN
            
            SELECT employee_id, first_name, last_name
            INTO v_emp_id, v_emp_name, v_emp_last_name
            FROM employees
            WHERE employee_id = i;
            
            DBMS_OUTPUT.PUT_LINE('Employee ID: ' || v_emp_id || ', Name: ' || v_emp_name || ' ' || v_emp_last_name);
        END IF;
    END LOOP;
END;
/
SET SERVEROUTPUT ON;
--loop
DECLARE
    v_emp_id employees.employee_id%TYPE;
    v_emp_name employees.first_name%TYPE;
    v_emp_last_name employees.last_name%TYPE;
    v_counter NUMBER := 100;
BEGIN
    
    LOOP
        
        EXIT WHEN v_counter > 120;
        
        IF MOD(v_counter, 2) = 0 THEN
            
            SELECT employee_id, first_name, last_name
            INTO v_emp_id, v_emp_name, v_emp_last_name
            FROM employees
            WHERE employee_id = v_counter;
            
            DBMS_OUTPUT.PUT_LINE('Employee ID: ' || v_emp_id || ', Name: ' || v_emp_name || ' ' || v_emp_last_name);
        END IF;
        v_counter := v_counter + 1;
    END LOOP;
END;
/
SET SERVEROUTPUT ON;
--while
DECLARE
    v_emp_id employees.employee_id%TYPE;
    v_emp_name employees.first_name%TYPE;
    v_emp_last_name employees.last_name%TYPE;
    v_counter NUMBER := 100;
BEGIN
    
    WHILE v_counter <= 120 LOOP
        
        IF MOD(v_counter, 2) = 0 THEN
            
            SELECT employee_id, first_name, last_name
            INTO v_emp_id, v_emp_name, v_emp_last_name
            FROM employees
            WHERE employee_id = v_counter;
            
            DBMS_OUTPUT.PUT_LINE('Employee ID: ' || v_emp_id || ', Name: ' || v_emp_name || ' ' || v_emp_last_name);
        END IF;
        v_counter := v_counter + 1;
    END LOOP;
END;
/


