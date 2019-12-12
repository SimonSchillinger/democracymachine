
import csv
with open('english.csv') as csv_file:
        csv_reader = csv.reader(csv_file, delimiter='\n')
        for row in csv_reader:
            question = ''.join(row)
            if question[0].isalpha(): 
                question = question
            else:
                q_start = 0
                for char in range(0,5):
                    if question[char].isalpha():
                        dosth=2
                    else:
                       q_start = q_start+1  
                question = question[q_start:len(question)]
            print(question)

