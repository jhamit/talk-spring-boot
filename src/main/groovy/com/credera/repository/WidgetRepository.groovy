package com.credera.repository

import com.credera.model.Widget
import org.springframework.data.repository.CrudRepository

public interface WidgetRepository extends CrudRepository<Widget, Long> {

}