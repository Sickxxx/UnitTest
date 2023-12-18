class Home_work:
    @staticmethod
    def find_average(numbers1, numbers2):
        if not isinstance(numbers1, list) or not isinstance(numbers2, list):
            raise TypeError("Input should be a list.")
        avg1 = sum(numbers1) / len(numbers1)
        avg2 = sum(numbers2) / len(numbers2)
        if avg1 > avg2:
            return "Первый список имеет большее среднее значение"
        if avg1 < avg2:
            return "Второй список имеет большее среднее значение"
        else:
            return "Средние значения равны"
