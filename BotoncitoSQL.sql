use comercial2;
ALTER TABLE productos ADD COLUMN PROSALDOFISICO NUMERIC(9,2) NULL;
SELECT * FROM productos;
CREATE TABLE AJUSTES(
	AJUCODIGO	CHAR(7)		NOT NULL,
    AJUFECHA	DATE		NOT NULL,
    AJUDESCRIPCION	CHAR(50)	NOT NULL,
    PRIMARY KEY(AJUCODIGO)
);

INSERT INTO AJUSTES (AJUCODIGO, AJUFECHA, AJUDESCRIPCION) VALUES ('AJ-0001', '2024-06-19', 'Ajuste por inventario anual');
INSERT INTO AJUSTES (AJUCODIGO, AJUFECHA, AJUDESCRIPCION) VALUES ('AJ-0002', '2024-06-20', 'Ajuste por error en entrada de mercancía');
INSERT INTO AJUSTES (AJUCODIGO, AJUFECHA, AJUDESCRIPCION) VALUES ('AJ-0003', '2024-06-21', 'Ajuste por pérdida de producto');


CREATE TABLE PXA (
	PROCODIGO	CHAR(9)			NOT NULL,
    AJUCODIGO	CHAR(9)			NOT NULL,
    PXADESCRIPCION CHAR(100)		NOT NULL,
    PXAUNIDADMEDIDA	CHAR(3)		NOT NULL,
    PXAFECHA	DATE			NOT NULL,
    PXASALDOINICIAL	NUMERIC(9,2)	NOT NULL,
    PXAINGRESOS	NUMERIC(9,2)	NOT NULL,
    PXAEGRESOS	NUMERIC(9,2)	NOT NULL,
    PXAAJUSTES	NUMERIC(9,2)	NOT NULL,
    PXASALDOFINAL	NUMERIC(9,2)	NOT NULL,
    PXASALDOFISICO	NUMERIC(9,2)	NOT NULL,
    PXASALDOTOTAL NUMERIC(9,2)	NOT NULL,
    PRIMARY KEY(PROCODIGO,AJUCODIGO),
    CONSTRAINT FK_PXA_PROCODIGO FOREIGN KEY (PROCODIGO) REFERENCES PRODUCTOS (PROCODIGO),
    CONSTRAINT FK_PXA_AJUCODIGO FOREIGN KEY (AJUCODIGO) REFERENCES AJUSTES (AJUCODIGO)
);
