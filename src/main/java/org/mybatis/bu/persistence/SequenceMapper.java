package org.mybatis.bu.persistence;

import org.mybatis.bu.domain.Sequence;

public interface SequenceMapper {

  Sequence getSequence(Sequence sequence);
  void updateSequence(Sequence sequence);
}
