package com.ironhack.assosiationofnurses.loader;
// Task1/Task2

import com.ironhack.assosiationofnurses.enums.GuestStatus;
import com.ironhack.assosiationofnurses.enums.StatusType;
import com.ironhack.assosiationofnurses.model.*;
import com.ironhack.assosiationofnurses.repository.*;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final chapterRepository chapterRepository;
    private final memberRepository memberRepository;
    private final eventRepository eventRepository;
    private final speakersRepository speakersRepository;
    private final guestRepository guestRepository;


    @Override
    @Transactional
    public void run(String... args) throws Exception {


        Chapter chapter = new Chapter();
        chapter.setName("Chapter Alpha");
        chapter.setDistrict("North Hessen");
        chapterRepository.save(chapter);

        Chapter chapter2 = new Chapter();
        chapter2.setName("Chapter Beta");
        chapter2.setDistrict("South Hessen");
        chapterRepository.save(chapter2);

        Chapter chapter3 = new Chapter();
        chapter3.setName("Chapter Gamma");
        chapter3.setDistrict("BRE");
        chapterRepository.save(chapter3);

        Chapter chapter4 = new Chapter();
        chapter4.setName("Chapter Bryta");
        chapter4.setDistrict("FRA North");
        chapterRepository.save(chapter4);

        Member president = new Member();
        president.setName("John Smith");
        president.setRenewalDate(LocalDate.now());
        president.setStatus(StatusType.ACTIVE);
        president.setChapter(chapter);
        chapter.setPresident(president);

        chapterRepository.save(chapter);
        memberRepository.save(president);

        Member president2 = new Member();
        president2.setName("Alba George");
        president2.setRenewalDate(LocalDate.now());
        president2.setStatus(StatusType.ACTIVE);
        president2.setChapter(chapter2);
        chapter2.setPresident(president2);

        chapterRepository.save(chapter2);
        memberRepository.save(president2);


        Member president3 = new Member();
        president3.setName("Pablo Rodrigez");
        president3.setRenewalDate(LocalDate.now());
        president3.setStatus(StatusType.ACTIVE);
        president3.setChapter(chapter3);
        chapter3.setPresident(president3);

        chapterRepository.save(chapter3);
        memberRepository.save(president3);

        Member president4 = new Member();
        president4.setName("Bob Smith");
        president4.setRenewalDate(LocalDate.now());
        president4.setStatus(StatusType.ACTIVE);
        president4.setChapter(chapter4);
        chapter4.setPresident(president4);

        chapterRepository.save(chapter4);
        memberRepository.save(president4);


        Member member = new Member();
        member.setName("Alice Newman");
        member.setRenewalDate(LocalDate.now());
        member.setStatus(StatusType.ACTIVE);
        member.setChapter(chapter);

        chapter.getMembers().add(member);
        memberRepository.save(member);

        Member member2 = new Member();
        member2.setName("Teresa Kaufman");
        member2.setRenewalDate(LocalDate.now());
        member2.setStatus(StatusType.ACTIVE);
        member2.setChapter(chapter2);

        chapter2.getMembers().add(member2);
        memberRepository.save(member2);


        Member member3 = new Member();
        member3.setName("Amira Ali");
        member3.setRenewalDate(LocalDate.now());
        member3.setStatus(StatusType.ACTIVE);
        member3.setChapter(chapter3);

        chapter3.getMembers().add(member3);
        memberRepository.save(member3);


        Member member4 = new Member();
        member4.setName("Raul Moreno");
        member4.setRenewalDate(LocalDate.now());
        member4.setStatus(StatusType.ACTIVE);
        member4.setChapter(chapter4);

        chapter4.getMembers().add(member4);
        memberRepository.save(member4);


        Member member5 = new Member();
        member5.setName("Charlie Dill");
        member5.setRenewalDate(LocalDate.now());
        member5.setStatus(StatusType.ACTIVE);
        member5.setChapter(chapter);

        chapter.getMembers().add(member5);
        memberRepository.save(member5);


        Member member6 = new Member();
        member6.setName("David Moreno");
        member6.setRenewalDate(LocalDate.now());
        member6.setStatus(StatusType.ACTIVE);
        member6.setChapter(chapter2);

        chapter.getMembers().add(member6);
        memberRepository.save(member6);


        Conference conference = new Conference();
        conference.setEventDate(LocalDate.now().plusDays(15));
        conference.setDuration(30);
        conference.setLocation("Halle A");
        conference.setTitle("Health and wealthy");

        Set<Speakers> speakersSet = new HashSet<>();

        Speakers speaker = new Speakers();
        speaker.setName("David Walid");
        speaker.setPresentationDuration(15);
        speaker.setConference(conference);
        speakersSet.add(speaker);

        Speakers speaker2 = new Speakers();
        speaker2.setName("Kaya Raya");
        speaker2.setPresentationDuration(12);
        speaker2.setConference(conference);
        speakersSet.add(speaker2);

        conference.setSpeakers(speakersSet);

        Set<Guest> guest = new HashSet<>();

        Guest guest1 = new Guest();
        guest1.setName("Ronald Maroon");
        guest1.setStatus(GuestStatus.ATTENDING);
        guest1.setEvent(conference);
        conference.getGuests().add(guest1);
        guestRepository.save(guest1);

        Guest guest2 = new Guest();
        guest2.setName("Gabi Ahmad");
        guest2.setStatus(GuestStatus.NOT_ATTENDING);
        guest2.setEvent(conference);
        conference.getGuests().add(guest2);
        guestRepository.save(guest2);

        Guest guest3 = new Guest();
        guest3.setName("Tim Schreck");
        guest3.setStatus(GuestStatus.NOT_ATTENDING);
        guest3.setEvent(conference);
        conference.getGuests().add(guest3);
        guestRepository.save(guest3);

        eventRepository.save(conference);

        Exhibition exhibition = new Exhibition();
        exhibition.setEventDate(LocalDate.now().plusDays(20));
        exhibition.setDuration(30);
        exhibition.setLocation("Halle B");
        exhibition.setTitle("Art of Salvador Dali");

        Speakers speaker3 = new Speakers();
        speaker3.setName("Romeo Carno");
        speaker3.setPresentationDuration(15);
        speaker3.setExhibition(exhibition);
        speakersSet.add(speaker3);

        Speakers speaker4 = new Speakers();
        speaker4.setName("Ariadna Dali");
        speaker4.setPresentationDuration(15);
        speaker4.setExhibition(exhibition);
        speakersSet.add(speaker4);

        exhibition.setSpeaker(speakersSet);

        Guest guest5 = new Guest();
        guest5.setName("Carlos Rodrigues");
        guest5.setStatus(GuestStatus.NOT_ATTENDING);
        guest5.setEvent(exhibition);
        exhibition.getGuests().add(guest5);
        guestRepository.save(guest5);

        Guest guest6 = new Guest();
        guest6.setName("Doron Cabillo");
        guest6.setStatus(GuestStatus.NOT_ATTENDING);
        guest6.setEvent(exhibition);
        exhibition.getGuests().add(guest6);
        guestRepository.save(guest6);

        Guest guest7 = new Guest();
        guest7.setName("Lara Marinova");
        guest7.setStatus(GuestStatus.NOT_ATTENDING);
        guest7.setEvent(exhibition);
        exhibition.getGuests().add(guest7);
        guestRepository.save(guest7);


        eventRepository.save(exhibition);


    }
}
