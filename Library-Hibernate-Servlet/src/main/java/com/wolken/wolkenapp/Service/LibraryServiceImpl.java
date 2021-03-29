package com.wolken.wolkenapp.Service;

import java.util.List;

import com.wolken.wolkenapp.DAO.LibraryDAO;
import com.wolken.wolkenapp.DAO.LibraryDAOImpl;
import com.wolken.wolkenapp.DTO.LibraryDTO;

public class LibraryServiceImpl implements LibraryService {

	LibraryDAO libraryDAO = new LibraryDAOImpl();

	@Override
	public void ValidateAndAddBook(LibraryDTO libraryDTO) {
		// TODO Auto-generated method stub
		if(libraryDTO!=null)
			libraryDAO.addBook(libraryDTO);
		else
			System.out.println("libraryDTO is null");

	}

	@Override
	public void ValidateAndUpdateBookPublisherByName(String bookPublisherToBeUpdated, String BookNameToUpdate) {
		// TODO Auto-generated method stub
		if(bookPublisherToBeUpdated.length()>0 && bookPublisherToBeUpdated.length()<45)
			if(BookNameToUpdate.length()>0 && BookNameToUpdate.length()<45)
				libraryDAO.updateBookPublisherByName(bookPublisherToBeUpdated, BookNameToUpdate);

	}

	@Override
	public void ValidateAndDeleteBookByBookName(String bookNameToBeDeleted) {
		// TODO Auto-generated method stub
		if(bookNameToBeDeleted.length()>0 && bookNameToBeDeleted.length()<45)
			libraryDAO.deleteBookByBookName(bookNameToBeDeleted);

	}

	@Override
	public List<LibraryDTO> ValidateAndGetAllBooks() {
		// TODO Auto-generated method stub

		return libraryDAO.getAllBooks();
	}

}
