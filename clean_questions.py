import sys
import csv

#file_name = "english_clean.csv"
cq_file = open(file_name, "w+")
with open('english.csv') as csv_file:
        csv_reader = csv.reader(csv_file, delimiter='\n')
        for row in csv_reader:
            question = ''.join(row)
            
            q_start = 0
            for char_pos in range(0,5):
                if not question[char_pos].isalpha():
                    q_start = q_start+1  
                else:
                    break
            question = question[q_start:len(question)]
            cq_file.write(question + "\n")

