package web.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import web.dto.request.filter.Filter;
import web.dto.request.account.UserUpdateDto;
import web.dto.response.AccountDataDto;
import web.model.User;

import java.util.List;
import java.util.UUID;

@Service
public interface UserService {

    User getUserById(UUID id);

    AccountDataDto getAccountData(User user);

    AccountDataDto getCurrentAccountData();

    List<AccountDataDto> getAccountsData(final List<UUID> ids);

    Page<AccountDataDto> getAccountsFilteredData(final Filter filter, final Pageable pageable);

    UUID getCurrentUserId();

    User getCurrentUser();

    void editCurrentUserData(final UserUpdateDto dto);

    void editUserData(final UUID id, final UserUpdateDto dto);

    void deleteCurrentUser();

    void deleteUsers(List<UUID> ids);

}
