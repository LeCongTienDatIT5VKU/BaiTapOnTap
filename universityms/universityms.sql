DROP TABLE IF EXISTS Learn;
DROP TABLE IF EXISTS Class;
DROP TABLE IF EXISTS Student;

CREATE TABLE Student (
    StudentId INT IDENTITY(1,1) PRIMARY KEY, 
    Name NVARCHAR(100),
    Age INT,
    Email NVARCHAR(100) UNIQUE,
    GPA DECIMAL(3,2) CHECK (GPA BETWEEN 0 AND 4) 
);
CREATE TABLE Class (
    ClassId INT IDENTITY(1,1) PRIMARY KEY,
    Description NVARCHAR(255) NOT NULL, 
    NumberOfCredits FLOAT CHECK (NumberOfCredits > 0)
);

CREATE TABLE Learn (
    LearnID INT IDENTITY(1,1) PRIMARY KEY, 
    StudentID INT,
    ClassID INT,
    FOREIGN KEY (StudentID) REFERENCES Student(StudentID) ON DELETE CASCADE,
    FOREIGN KEY (ClassID) REFERENCES Class(ClassID) ON DELETE CASCADE
);
INSERT INTO Student (Name, Age, Email, GPA) 
VALUES ('Nguyễn Văn An', 20, 'annv@vku.udn.vn', 3.5);

INSERT INTO Class (Description, NumberOfCredits) 
VALUES ('Lập trình Java cơ bản', 3);

INSERT INTO Learn (StudentID, ClassID) 
VALUES ((SELECT StudentID FROM Student WHERE Email = 'annv@vku.udn.vn'), 
        (SELECT ClassID FROM Class WHERE Description = 'Lập trình Java cơ bản'));
