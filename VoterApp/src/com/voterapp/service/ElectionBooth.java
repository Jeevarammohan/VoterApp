package com.voterapp.service;

import java.util.Arrays;
import java.util.List;

import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NoVoterIdFoundException;
import com.voterapp.exception.NotEligibleException;
import com.voterapp.exception.UnderAgeException;

public class ElectionBooth {
	List<String> localityList = Arrays.asList("ABC", "XYZ", "WGM", "MGR", "JKM");

	boolean checkAge(int age) throws UnderAgeException {
		if (age < 18) {
			throw new UnderAgeException("Sorry,You can't vote,Age is under 18");
		}
		return true;
	}

	boolean checkLocality(String locality) throws LocalityNotFoundException {
		if (!localityList.contains(locality)) {
			throw new LocalityNotFoundException("Locality not found");
		}
		return true;
	}

	boolean checkVoterId(int voterId) throws NoVoterIdFoundException {
		if (voterId < 1000 && voterId > 9000) {
			throw new NoVoterIdFoundException("VoterId doesn't exist");
		}
		return true;
	}

	public boolean checkEligibility(int age, String locality, int voterId) throws NotEligibleException {
		try {
			checkAge(age);
			checkLocality(locality);
			checkVoterId(voterId);
		} catch (NotEligibleException e) {
			throw e;
		}
		return true;
	}

}
