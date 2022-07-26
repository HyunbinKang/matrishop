package matri.matrishop.mapper;

import matri.matrishop.model.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper {

    Account getName(int id);

//    @Select("SELECT * FROM info")
//    Info getName();
}
