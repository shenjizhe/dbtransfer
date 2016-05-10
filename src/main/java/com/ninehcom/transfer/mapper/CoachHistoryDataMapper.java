package com.ninehcom.transfer.mapper;

import com.ninehcom.transfer.entity.CoachHistoryData;
import com.ninehcom.common.entity.PageParam;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * CoachHistoryData的Mapper，用于Mybatis
 * @author shenjizhe
 * @version 1.0.0
 */
@Component
public class CoachHistoryDataMapper {

    @Autowired
    @Qualifier("jdbc_guoan_new_template")
    SqlSession sqlSession;

    public List<CoachHistoryData> selectAllCoachHistoryData(){
	return sqlSession.selectList("selectAllCoachHistoryData", null);
    }

    public CoachHistoryData selectCoachHistoryDataById(int Id){
	return sqlSession.selectOne("selectCoachHistoryDataById", Id);
    }
}
