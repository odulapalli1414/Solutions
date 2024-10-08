SELECT S.STUDENT_ID AS student_id, S.STUDENT_NAME AS student_name, SJ.SUBJECT_NAME AS subject_name, COUNT(E.STUDENT_ID) AS attended_exams
FROM STUDENTS S
CROSS JOIN SUBJECTS SJ
LEFT JOIN EXAMINATIONS E ON E.STUDENT_ID = S.STUDENT_ID AND SJ.SUBJECT_NAME = E.SUBJECT_NAME
GROUP BY S.STUDENT_ID, S.STUDENT_NAME, SJ.SUBJECT_NAME
ORDER BY S.STUDENT_ID, SJ.SUBJECT_NAME;
