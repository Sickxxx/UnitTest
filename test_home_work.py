from unittest.mock import Mock
from home_work import Home_work
import pytest


def test_find_average():
    assert Home_work.find_average([10, 20, 30, 40, 50], [10, 20, 30, 40, 50]) == 'Средние значения равны'
    assert Home_work.find_average([4, 4], [2, 2, 2, 2]) == 'Первый список имеет большее среднее значение'
    assert Home_work.find_average([3, 3, 3], [10, 10, 10]) == 'Второй список имеет большее среднее значение'


def test_avg_typeerror():
    with pytest.raises(TypeError):
        Home_work.find_average("2", 1)
