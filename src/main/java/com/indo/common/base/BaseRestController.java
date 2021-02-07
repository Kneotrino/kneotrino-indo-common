package com.indo.common.base;

import javassist.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

/**
 * BaseRestController
 * this is simple interface for spring boot controllers
 *
 * @author  kneotrino
 * @version 1.0
 * @since   2021-1-1
 */
public interface BaseRestController<DTO> {

  @GetMapping("/{id}")
  DTO GetOneById(@PathVariable Long id) throws NotFoundException, IOException;

  @PostMapping("/")
  DTO PostOne(@RequestBody DTO data) throws NotFoundException, IOException;

  @PutMapping("/{id}")
  DTO PutOneById(@RequestBody DTO data, @PathVariable Long id) throws NotFoundException, IOException;

  @GetMapping("/all")
  List<DTO> GetAll() throws IOException, NotFoundException;


  @ResponseStatus(HttpStatus.NO_CONTENT)
  @DeleteMapping("/{id}")
  void DeleteOneById(@PathVariable Long id) throws NotFoundException, IOException;

}
