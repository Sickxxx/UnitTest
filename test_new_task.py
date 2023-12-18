from unittest.mock import Mock

import pytest
from Tasks import Tasks


def test_find_average():
    assert Tasks.find_average([10, 20, 30, 40, 50]) == 30
    assert Tasks.find_average([]) == 0
    assert Tasks.find_average([5]) == 5


def test_find_avg_exceptions():
    with pytest.raises(TypeError):
        Tasks.find_average_2("a")


@pytest.fixture()
def person_and_bank():
    person = Tasks.Person(100)
    bank = Tasks.Bank()
    return person, bank


def test_transfer_money(person_and_bank):
    person, bank = person_and_bank
    person.transfer_money(90, bank)
    assert person.balance == 10
    assert bank.balance == 90


def test_mock_transfer_money():
    pers = Tasks.Person(100)
    bank = Mock()
    pers.transfer_money(90, bank)
    assert pers.balance == 10
    bank.receive_money.assert_called_with(90)


def test_div_by_zero():
    with pytest.raises(ZeroDivisionError):
        Tasks.divide(2, 0)


@pytest.mark.parametrize("a,b, expected", [
    (10, 0, 0), (2, 3, 6), (5, 10, 50)])
def test_multiple(a, b, expected):
    assert Tasks.multiply(a, b) == expected


@pytest.mark.parametrize("a, expected", [
    (10, False), (2, True), (21, False)])
def test_is_prime(a, expected):
    assert Tasks.is_prime(a) == expected
