package mx.com.ids.test2crud.service;


import mx.com.ids.test2crud.model.Language;

import java.util.List;

public interface LanguageService {

    Language createLanguage(Language language);

    Language updateLanguage(Language language);

    List<Language> getAllLanguages();

    Language getLanguageById(long languageId);

    void deleteLanguage(long id);
}
