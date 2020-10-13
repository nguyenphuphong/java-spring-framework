CREATE SEQUENCE sq_name_id;

CREATE TABLE tb_names (
    id INT NOT NULL DEFAULT sq_name_id.nextval PRIMARY KEY,
    short_name VARCHAR(15),
    full_name VARCHAR(50)
);

INSERT INTO tb_names (short_name, full_name) VALUES ('phong', 'Nguyen Phu Phong');
