package org.zerock.dao;

import dao.TodoDAO;
import dto.TodoDTO;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class TodoDAOTests {

    @Test
    public void testList()throws Exception{
        for (TodoDTO dto: TodoDAO.INSTANCE.list(2,10)) {
            System.out.println(dto);
        }
    }

    @Test
    public void testUpdate()throws Exception{
        IntStream.rangeClosed(73,73).forEach(i ->{
            TodoDTO dto = TodoDTO.builder()
                    .title("change")
                    .memo("lee")
                    .dueDate(LocalDate.parse("2023-01-31"))
                    .complete(true)
                    .tno(i).build();
            try{
                System.out.println(TodoDAO.INSTANCE.update(dto));
            }catch (Exception e){
                throw new RuntimeException(e);
            }
        });
    }
    @Test
    public void testDelete(){
        IntStream.rangeClosed(71,71).forEach(i ->{
            TodoDTO dto = TodoDTO.builder()
                    .tno(i).build();
            try{
                System.out.println(TodoDAO.INSTANCE.Delete(dto));
            }catch (Exception e){
                throw new RuntimeException(e);
            }
        });
    }
    @Test
    public void testInserts(){
        IntStream.rangeClosed(1,1).forEach(i->{
            TodoDTO dto = TodoDTO.builder()
                    .title("Ktest"+i)
                    .memo("Ktest...")
                    .dueDate(LocalDate.now()).build();

            try{
                System.out.println(TodoDAO.INSTANCE.insert(dto));
            }catch (Exception e){
                throw new RuntimeException(e);
            }
        });
    }

}
