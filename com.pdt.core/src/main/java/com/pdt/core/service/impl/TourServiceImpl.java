package com.pdt.core.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import com.google.common.collect.ImmutableList;
import com.pdt.core.dao.impl.GenericDaoImpl;
import com.pdt.core.model.Articles;
import com.pdt.core.model.Tour;
import com.pdt.core.model.TravelSubject;
import com.pdt.core.model.TravelSubjectTourAssociation;
import com.pdt.core.service.TourService;

@Transactional
public class TourServiceImpl extends GenericDaoImpl implements TourService {

	@Override
	public List<TravelSubjectTourAssociation> createSubjectTours() {
		String tourName[] = { "Du lich Ha Long", "Kham pha dao Cat Ba", "Ngam tuyet roi tai SaPa", "Tham quan thu do", "Tham dan toc HMong" };
		List<Tour> tours = new ArrayList<>();
		for (int i = 0; i < tourName.length; i++) {
			System.out.println("Inserting tour '" + tourName[i]);
			Tour t = new Tour();
			Articles a = new Articles("Randonnée au pays des Thai - 8 jours / 7 nuits", "Pham Hung", "");
			t.setName(tourName[i]);
			t.setArticles(a);
			t = insert(t);
			tours.add(t);
		}

		TravelSubject culture = new TravelSubject("Van hoa", "Du lich van hoa Viet Nam");
		TravelSubject city = new TravelSubject("Thanh thi", "Du lich cac tinh thanh Viet Nam");

		culture = insert(culture);
		city = insert(city);

		TravelSubjectTourAssociation cultureTour = new TravelSubjectTourAssociation(tours.get(1), culture);
		TravelSubjectTourAssociation cultureTour1 = new TravelSubjectTourAssociation(tours.get(4), culture);
		TravelSubjectTourAssociation cityTour = new TravelSubjectTourAssociation(tours.get(0), culture);
		TravelSubjectTourAssociation cityTour1 = new TravelSubjectTourAssociation(tours.get(3), culture);
		List<TravelSubjectTourAssociation> subjectTour = ImmutableList.of(cultureTour, cultureTour1, cityTour, cityTour1);
		return insert(subjectTour);
	}
}
